import './App.css';
import AppBar from './components/Appbar';
import Login from './components/Login';
import JpSentences from './components/JpSentences';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import HomePage from './components/HomePage';

function App() {
  return (
    <div className="App">
    <Router>
    <AppBar/>
    <Routes>
          {/* Define routes here */}
          <Route exact path="/" element={<HomePage />} />
          <Route path="/login" element={<Login />} />
          <Route path="/jpSentences" element={<JpSentences />} />
          {/* Add other routes as needed */}
    </Routes>
    </Router>
    </div> 
  );
}

export default App;
