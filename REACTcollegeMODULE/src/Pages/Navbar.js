import React from 'react'
import { Link } from 'react-router-dom'
export const Navbar = () => {
  return (
    <div className="NavbarContent">

      <nav>

        <Link to='./'>HOME</Link><br></br>
        <Link to='./About'>ABOUT</Link><br></br>
        <Link to='./Table'>TABLE</Link><br></br>
        <Link to='./Contact'>CONTACT</Link>

      </nav>

    </div>

  )
}
export default Navbar