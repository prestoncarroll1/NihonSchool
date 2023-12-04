import * as React from 'react';

import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container , Paper, Button} from '@mui/material'
import { useEffect, useState } from 'react';

export default function JpSentences() {

    const paperStyle = {padding: '50px 20px', width:600, margin: "20px auto"}
    const [jpSentence, setJpSentence]= useState('');
    // const [engSentence, setEngSentence]= useState('');

    useEffect(()=>{
      fetch("http://localhost:8080/jpsentences/getRandom")
      .then(res=> res.json())
      .then((result)=>{
        setJpSentence(result.jpSentence)
      })
    },[])

    
  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1>What does this say?</h1>
            <h2> {jpSentence} </h2>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Jp" variant="outlined" fullWidth/>
    <br></br>
    <Button variant="contained" >Submit</Button>
    </Box>
    </Paper>
    </Container>
  );
}