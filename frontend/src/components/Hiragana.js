import * as React from 'react';
import {useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container , Paper, Button} from '@mui/material'

export default function Hiragana() {

    const [hiraganaCharacters, setHiraganaCharacters]= useState('')
    const paperStyle = {padding: '50px 20px', width:600, margin: "20px auto"}
    const handleClick=(e)=>{
        e.preventDefault()
        const hiragana={hiraganaCharacters}
        console.log(hiragana)
        fetch("http://localhost:8080/hiragana/add",{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body: JSON.stringify(hiragana)
    }).then(()=>{
        console.log("New Hiragana added")
    })}
    
  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1>What does this say?</h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Hiragana" variant="outlined" fullWidth 
      value={hiraganaCharacters}
      onChange={(e)=>setHiraganaCharacters(e.target.value)}
      />
    <br></br>
    <Button variant="contained" onClick={handleClick}>Submit</Button>

    </Box>
    </Paper>
    </Container>
  );
}
