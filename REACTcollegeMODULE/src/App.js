import './App.css';
import React from 'react';
import { useState, useEffect } from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import axios from 'axios'
import Navbar from './Pages/Navbar';
import Home from './Pages/Home';
import About from './Pages/About';
import Table from './Pages/Table';

import Contact from './Pages/Contact';
import Output from './Pages/Output';

const App = () => {

  const baseURL = "http://localhost:8083/products"
  const [post, setPost] = useState(null);
  useEffect(() => {
    axios.get(baseURL).then((response) => {
      setPost(response.data);
    });
  }, []);


  const handleDelete = (id) => {
    axios.delete(`https://localhost:8083/products/${id}`)
      .catch((err) => alert(err))
  }




  //  const [name,setName]=useState("");
  //  const [college,setCollege]=useState("");
  //  const [date,setDate]=useState("");
  //  const [qualification,setQualification]=useState("");
  //  const [year,setYear]=useState("");

  //  const handlePopup = (id) =>{
  //    console.log(name);
  //    console.log(college);
  //    console.log(date);
  //    console.log(qualification);
  //    console.log(year);
  //    let data = {
  //      name: name,
  //      college: college,
  //      date: date,
  //      qualification: qualification,
  //      year:year
  //    }
  //    axios.put(`http://localhost:8000/Placements${id}`,data)
  //    .then((response)=>{
  //      console.log(response)
  //    })
  //  }


  return (
    <>
      <Router>
        <div className="page">
          <Navbar />
        </div>
        <div className="Home">
          <Routes>
            <Route exact path='/' element={< Home />}></Route>
            <Route exact path='/About' element={< About />}></Route>
            <Route exact path='/Table' element={< Table post={post} handleDelete={handleDelete} />}></Route>
            <Route exact path='/Output' element={< Output />}></Route>
          </Routes>
        </div>
      </Router>
    </>
  );
}

export default App;