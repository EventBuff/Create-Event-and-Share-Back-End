/*
* @Author: Lich Amnesia
* @Date:   2016-11-04 14:51:22
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-06 15:16:14
*/


import React, { Component } from 'react';
import logo from './logo.svg';
import './Event.css';
import Navigation from './Navigation';
import axios from 'axios';
import { Button }
  from 'react-bootstrap';

class Event extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: '',
      value: '',
    };
    this.myFunction = this.myFunction.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.searchEvent = this.searchEvent.bind(this);
  }
  
  myFunction(){
    axios.get('/greeting?name=2', {
        // name: 2
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

  handleChange(event){
    this.setState({value: event.target.value});
  }

  searchEvent(event){
    console.log(this.state.value);
    axios.get('/greeting', {
        params: {
          name: this.state.value
        }
      }).then(res => {
        var post = res.data.content;
        this.setState({ 
          posts: post 
        });
      });
  }

  render() {
    var value = this.state.value;
    var posts = this.state.posts;
    // Display get product button
    const searchEventButton =
      <Button
          onClick={this.searchEvent}
          bsStyle="success"
          bsSize="large">Search
      </Button>;
    return (
      <div>
        <Navigation />
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
          <div>
              <input type="text" value={value} onChange={this.handleChange} />
              <p>{value}</p>
              {searchEventButton}
              {posts}
          </div>
        </div>
      </div>
    );
  }
}

export default Event;
