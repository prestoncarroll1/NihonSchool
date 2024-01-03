import * as React from 'react';

import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container , Paper, Button} from '@mui/material'
import { useEffect, useState } from 'react';

export default function JpSentences() {

    const paperStyle = {padding: '50px 20px', width:600, margin: "20px auto"}
    const [sentenceData, setSentenceData] = useState({ jpSentence: '', engSentence: '' });
    const [userInput, setUserInput] = useState('');
    const [isCorrect, setIsCorrect] = useState(false);
    const [correctOrTryAgain, setCorrectOrTryAgain] = useState('');

    useEffect(() => {
      fetchRandomSentence();
    }, [isCorrect]);

    const fetchRandomSentence = () => {
      fetch("http://localhost:8080/jpsentences/getRandom")
      .then((res) => {
        if (!res.ok) {
          throw new Error(`HTTP error! Status: ${res.status}`);
        }
        return res.json();
      })
      .then((result) => {
        // Check if the response has the expected structure
        if (result && result.jpSentence && result.engSentence) {
          setSentenceData(result);
        } else {
          console.error('Invalid response format:', result);
        }
      })
      .catch((error) => console.error('Error fetching random JP sentence:', error));
  };

  const handleKeyDown = (e) => {
    if (e.code === "Enter") {
      e.preventDefault();
      handleSubmit();
    } else {
      setUserInput(e.target.value);
    }
  };

  const handleSubmit = () => {
    // Compare user input with engSentence
    const isInputCorrect = userInput.trim() === sentenceData.engSentence.trim();
    setIsCorrect(isInputCorrect);

    if (isInputCorrect) {
      // If the input is correct, fetch a new random sentence
      fetchRandomSentence();
      setUserInput("")
      setCorrectOrTryAgain("Correct!")
    }
    else {
      setCorrectOrTryAgain("Try again.")
    }
  };

  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1>What does this say?</h1>
            <h2>{sentenceData.jpSentence} </h2>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField 
      id="outlined-basic" 
      label="Don't worry about symbols / punctuation!" 
      variant="outlined" 
      fullWidth
      value={userInput}
      onChange={handleKeyDown}
      onKeyDown={handleKeyDown}
      />
    <br></br>
    <Button variant="contained" onClick={handleSubmit} >Submit</Button>
    {correctOrTryAgain}
    </Box>
    </Paper>
    </Container>
  );
}