const axios = require('axios');
const axiosInstance = axios.create();

return axiosInstance.get('http://localhost:8080/greeting')
  .then(res => console.log(res), err => console.log(err.message));
