import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';


class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: ''
    };
    this.myFunction = this.myFunction.bind(this);
  }
  
  myFunction(){
    axios.get('/greeting', {
        name: 2
      }).then(res => {
        const posts = res.data.content;
        this.setState({ posts });
      });
      // function(response){
      //     console.log(response);
      //     const post = response.data.content;
      //     console.log(post)
      //     this.setState({ post });
      // });
  }

  componentDidMount() {
    this.myFunction();
    
    //     res => {
    //     const posts = res.data;
    //     this.setState({ posts });
    // });
  }

  render() {
    return (
      <div>
      
      <Event />
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React </h2>
        </div>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
        <ul>
          {this.state.posts}
        </ul>
      </div>
      </div>
    );
  }
}

export default App;
