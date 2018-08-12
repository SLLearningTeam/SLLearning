import React, { Component } from 'react';
import './App.css';
import Header from './Header/Header';
import Home from './Content/Home';
import Footer from './Footer/Footer';

class App extends Component {
  render() {
    return (
      <div className="App">
          <Header/>
          <Home/>
          <Footer/>
      </div>
    );
  }
}

export default App;
