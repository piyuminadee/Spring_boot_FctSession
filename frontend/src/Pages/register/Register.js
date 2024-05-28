
import React, { useState } from 'react'
import './Register.css'
import 'bootstrap/dist/css/bootstrap.min.css';
//import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import Row from 'react-bootstrap/Row';
import axios from 'axios';


const Register = ()=>{
  
    const [validated, setValidated] = useState(false);

    const handleSubmit = (event) => {
      const form = event.currentTarget;
      if (form.checkValidity() === false) {
        event.preventDefault();
        event.stopPropagation();
      }
  
      setValidated(true);
      axios.post('http://localhost:7800/auth/register', {
        email: '',
        name: '',
        contactNo: ''
      })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
    };

      return(
       
         <Form  >
      <Row className="mb-3">
        <Form.Group as={Col} md="4" controlId="validationCustom01">
          <Form.Label>First name</Form.Label>
          <Form.Control
            required
            type="text"
            placeholder="First name"
            defaultValue="Mark"
          />
          <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
        </Form.Group>

        <Form.Group as={Col} md="4" controlId="validationCustom02">
          <Form.Label>Email</Form.Label>
          <Form.Control
            required
            type="email"
            placeholder="email"
            defaultValue="Otto"
          />
          <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
        </Form.Group>


        <Form.Group as={Col} md="4" controlId="validationCustom03">
          <Form.Label>Contact no</Form.Label>
          <Form.Control
            required
            type="tel"
            placeholder="phone"
            defaultValue="Otto"
          />
          <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
        </Form.Group>
       
      </Row>
      
      <Button onClick={handleSubmit} >Submit form</Button>
    </Form>
       
      )
}

export default Register;