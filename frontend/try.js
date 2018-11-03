const axios = require('axios');
const axiosInstance = axios.create();

return axiosInstance.get('http://localhost:8080/backend')
  .then(res => console.log(res));
