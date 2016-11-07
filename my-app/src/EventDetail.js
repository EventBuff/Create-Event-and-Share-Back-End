/*
* @Author: Lich Amnesia
* @Date:   2016-11-06 20:43:01
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-06 21:41:17
*/

import React, { Component, PropTypes } from 'react';
import './EventDetail.css';
import axios from 'axios';
// import { Link } from 'react-router';
import { Grid } from 'react-bootstrap';

class EventDetail extends Component {
  static propTypes = {
    params: PropTypes.object.isRequired
  }

  constructor(props) {
    super(props);

    this.state = {
      posts: '', 
      postsCheckNum: 0
    };
    this.showEventDetail = this.showEventDetail.bind(this)

  }

  componentWillMount() {
    const slug = this.props.params.slug;
    console.log(slug);
  }

  componentDidMount() {
    const slug = this.props.params.slug;
    axios.get('/eventDetail', {
      params: {
        eventid: slug  
      }
      }).then(res => {
        this.showEventDetail(res.data);
      });
  }

  showEventDetail(data) {
    if (data === null || data.length === 0) {
      this.setState({ 
          posts: ''
      });
    } else {
      var content = data.map((x) =>
          <div key={x.eventid}>
            <h4><Link to={`/eventDetail/${x.eventid}`}> {x.eventtitle} </Link></h4>
            <p> {x.eventdescription} </p>  
          </div>
      );
      
      this.setState({ 
          posts: content,
          postsCheckNum: 1
      });
    }
  }

  render() {
    let detail =
      <Grid>
        <h2>We could not find that event.</h2>
        <h3>Try searching or using the top navigation to find what you are looking for.</h3>
      </Grid>;
    var posts = this.state.postsCheckNum 
      ? this.state.posts
      : detail;
    

    return(
      <div>
        <div className="ReactEshop__nav-spacer" />
        {posts}
      </div>
    );
  }

}

export default EventDetail;