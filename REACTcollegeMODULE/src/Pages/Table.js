import React, { useState } from 'react'
import axios from 'axios'
import Popup from 'reactjs-popup'
import './Project.css'
const Table = ({ post, handleDelete }) => {

  const [id, setid] = useState("");
  const [collegeadmin, setcollegeadmin] = useState("");
  const [collegename, setcollegename] = useState("");
  const [location, setlocation] = useState("");
  const handlePost = () => {

    const data = {
      id: id,
      name: collegeadmin,
      orderid: collegename,
      phone: location,
    }
    axios.post(`http://localhost:8083/products`, data)
      .catch((err) => console.log("Error", err))
  }

  return (
    <>
      <div id='form'>
        <div className="form">
          <h1 className="header">Add new data here</h1>
          <label htmlFor="name">Enter a id</label><br />
          <input type="text" value={id} onChange={(e) => setid(e.target.value)} /><br />
          <label htmlFor="name">Enter collegeadmin name</label><br />
          <input type="text" value={collegeadmin} onChange={(e) => setcollegeadmin(e.target.value)} /><br />
          <label htmlFor="name">Enter collegename</label><br />
          <input type="text" value={collegename} onChange={(e) => setcollegename(e.target.value)} /><br />
          <label htmlFor="name">Enter location</label><br />
          <input type="text" value={location} onChange={(e) => setlocation(e.target.value)} /><br />

          <button className="btn btn-primary my-3" onClick={handlePost}>Add Data</button>
        </div>
      </div>
      <div>
        <h1 className='h1'>Data</h1>
        <table>
          <tbody>
            <div className="tablecontent">
              <tr>
                <th>Id</th>
                <th>collegeadmin</th>
                <th>collegename</th>
                <th>location</th>

                <th>Edit</th>
                <th>Delete</th>
              </tr>

              {post && post.map((Post) => (
                <tr>
                  <td>{Post.id}</td>
                  <td>{Post.collegeadmin}</td>
                  <td>{Post.collegename}</td>
                  <td>{Post.location}</td>

                  <td><Popup trigger={<button className="btn btn-primary">Edit</button>} position="right center">
                    <h4>Update Data Here</h4>
                    <label htmlFor="name">Enter a id</label><br />
                    <input type="text" placeholder={Post.id} /><br />
                    <label htmlFor="name">Enter a collegeadmin name</label><br />
                    <input type="text" placeholder={Post.collegeadmin} /><br />
                    <label htmlFor="name">Enter collegename</label><br />
                    <input type="text" placeholder={Post.collegename} /><br />
                    <label htmlFor="name">Enter location</label><br />
                    <input type="text" placeholder={Post.location} /><br />

                    <button class="btn btn-primary">Update</button>
                  </Popup>

                  </td>
                  <td><button className="btn btn-primary" onClick={() => handleDelete(Post.id)}>Delete</button></td>
                </tr>
              ))}
            </div>
          </tbody>
        </table>

      </div>
    </>
  )
}
export default Table