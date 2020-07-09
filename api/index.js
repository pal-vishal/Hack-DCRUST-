const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
const User = require('./models/user');

app.use(bodyParser.json());

mongoose.connect('mongodb://localhost:27017/naukri', {
  useCreateIndex: true,
  useFindAndModify: false,
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

let port = 9090;

app.post('/user', (req, res) => {
  const { name, phone, district, pincode, uid, skills, isEmployee } = req.body;
  const newUser = new User({
    isEmployee,
    name,
    phone,
    district,
    pincode,
    uid,
    skills,
  });
  newUser.save()
    .then((doc) => res.send(doc))
    .catch((e) => res.status(400).send(e))
});

app.get('/searchEmployees', (req, res) => {
  const {pincode, skill} = req.query;
  User.find({pincode, skills : skill, isEmployee: true })
    .then(employees => {
      return res.send(employees);
    })
    .catch(e => res.status(400).send(e));
});

app.get('/user', (req, res) => {
  const {uid} = req.query;
  User.findOne({uid})
    .then(doc => {
      return res.send(doc);
    })
    .catch(e => res.status(400).send(e));
});

app.get('/all', (req,res) => {
  User.find()
  .then(doc => {
    return res.send(doc);
  })
  .catch(e => res.status(400).send(e));
})

app.listen(port, () => { console.log(`Server is up on port ${port}`); });
