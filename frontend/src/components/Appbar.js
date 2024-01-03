import React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import { MenuItem, Menu } from '@mui/material';
import { Link } from 'react-router-dom';



export default function Appbar() {

    const [anchorEl, setAnchorEl] = React.useState(null);
    const open = Boolean(anchorEl);
    const handleClick = (event) => {
      setAnchorEl(event.currentTarget);
    };
    const handleClose = () => {
      setAnchorEl(null);
    };
    
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar style={{backgroundColor: 'black'}} position="static">
        <Toolbar >
        <div>
      <Button
        color="inherit"
        id="basic-button"
        aria-controls={open ? 'basic-menu' : undefined}
        aria-haspopup="true"
        aria-expanded={open ? 'true' : undefined}
        onClick={handleClick}
      >
        ☰
      </Button>
      <Menu
        id="basic-menu"
        anchorEl={anchorEl}
        open={open}
        onClose={handleClose}
        MenuListProps={{
          'aria-labelledby': 'basic-button',
        }}
      >
         <Link to="/" style={{ textDecoration: 'none' }}>
        <MenuItem onClick={handleClose}>Home</MenuItem>
        </Link>
        <Link to="/jpsentences" style={{ textDecoration: 'none' }}>
        <MenuItem onClick={handleClose}>Practice Sentences</MenuItem>
        </Link>
      </Menu>
    </div>
          <Typography  variant="h6" component="div" sx={{ flexGrow: 1, textAlign: 'center'  }}>
            Nihon School
          </Typography>
          <Link to="/login"  style={{ textDecoration: 'none', color: 'white' }}>
          <Button color="inherit">Login</Button>
          </Link>
        </Toolbar>
      </AppBar>
    </Box>
  );
}