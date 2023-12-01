import * as React from 'react';
import {useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container , Paper} from '@mui/material'


export default function Hiragana() {

    const [hiragana, setHiragana]= useState('')
    

    const paperStyle = {padding: '50px 20px', width:600, margin: "20px auto"}
  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"red"}}>What does this say?</h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Hiragana" variant="outlined" fullWidth 
      value={hiragana}
      onChange={(e)=>setHiragana(e.target.value)}
      />

    </Box>
    </Paper>
    </Container>
  );
}
