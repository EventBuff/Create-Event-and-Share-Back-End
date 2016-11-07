/*
* @Author: Lich Amnesia
* @Date:   2016-11-06 21:56:58
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-06 22:08:43
*/


import React, { Component } from 'react';
// import logo from './logo.svg';
import './Profile.css';
// import Navigation from './Navigation';
import axios from 'axios';
import { Button, Row, Col}
  from 'react-bootstrap';
import { Link } from 'react-router';

class Profile extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: '',
      postsCheckNum: 0
    };
    this.showProfile = this.showProfile.bind(this);
  }
  

  componentDidMount() {
    const slug = this.props.params.slug;
    axios.get('/profile', {
      params: {
        userid: slug  
      }
      }).then(res => {
        this.showProfile(res.data);
      });
  }

  showProfile(data) {
    console.log(data);
    if (data === null || data.length === 0) {
      this.setState({ 
          posts: ''
      });
    } else {
      var content = 
          <div>
            <h4>{data.eventtitle}</h4>
          </div>;
      this.setState({ 
          posts: content,
          postsCheckNum: 1
      });
    }
  }

  render() {
    var value = this.state.value;
    var posts = this.state.posts;
    return (
      <div>
        <div>
          <Row>
            <Col className="ProfileNavigation" xs={12} md={3}>
            Tags:
              
            </Col>
            <Col md={9}>
              {posts}
            </Col>
          </Row>
        </div>
      </div>
    );
  }
}

export default Profile;
