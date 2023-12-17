import './App.css';
import AppBar from './components/Appbar';
import Hiragana from './components/Hiragana';
import JpSentences from './components/JpSentences';

function App() {
  return (
    <div className="App">
    <AppBar/>
    {/* <Hiragana /> */}
    <JpSentences />
    </div>
  );
}

export default App;
