import logo from './logo.svg';
import './App.css';
import { useEffect } from 'react';

function App() {
  useEffect( ()=>{
    // fetch("http://backend:8080/api/test/home")
    // .then( ( res ) => res.json() )
    // .then(   res   => console.log( '1', res ) )
    // .catch( err => console.log( '1',err ) )

    // fetch("http://server:8080/api/test/home")
    // .then( ( res ) => res.json() )
    // .then(   res   => console.log( '2',res ) )
    // .catch( err => console.log( '2',err ) )

    fetch("/api/test/home")
    .then( ( res ) => res.json() )
    .then(   res   => console.log( '3',res ) )
    .catch( err => console.log( '3',err ) )
  }, []);
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
