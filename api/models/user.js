const {Schema, model} = require('mongoose');

const userSchema = new Schema({
  name: {
    type: String,
    required: true,
  },
  isEmployee: {
    type: Boolean,
  },
  phone: {
    type: Number,
    required: true,
    unique: true
  },
  uid: {
    type: String,
    required: true,
    unique: true
  },
  district: {
    type: String,
  },
  pincode: {
    type: Number,
  },
  skills: {
    type: Array,
  },
});

module.exports = model('User', userSchema);
