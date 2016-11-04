/*
* @Author: Lich Amnesia
* @Date:   2016-11-04 14:51:22
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-04 15:04:52
*/

'use strict';

import React, { Component } from 'react';
import logo from './logo.svg';
import './Event.css';
import axios from 'axios';


class Event extends Component {
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
      <div className="Event">
        <div className="Event-header">
          <img src={logo} className="Event-logo" alt="logo" />
          <h2>Welcome to React </h2>
        </div>
        <p className="Event-intro">
          This is for event, edit <code>src/Event.js</code> and save to reload.
        </p>
        <ul>
          {this.state.posts}
        </ul>
      </div>
    );
  }
}

export default App;
