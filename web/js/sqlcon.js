/**
 * Created by 纪小雷 on 2019/5/12.
 */
var mysql      = require('mysql');
var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'yulei970423L',
    database : 'username'
});

connection.connect();

connection.query('SELECT 1 + 1 AS solution', function (error, results, fields) {
    if (error) throw error;
    console.log('The solution is: ', results[0].solution);
});