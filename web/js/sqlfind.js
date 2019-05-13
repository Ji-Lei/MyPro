/**
 * Created by 纪小雷 on 2019/5/12.
 */
var mysql  = require('mysql');

var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'yulei970423L',
    port: '3306',
    database: 'username'
});

connection.connect();

var  sql = 'SELECT * FROM uesrpass';
//查
connection.query(sql,function (err, result) {
    if(err){
        console.log('[SELECT ERROR] - ',err.message);
        return;
    }

    console.log('--------------------------SELECT----------------------------');
    console.log(result);
    console.log('------------------------------------------------------------\n\n');
});

connection.end();
