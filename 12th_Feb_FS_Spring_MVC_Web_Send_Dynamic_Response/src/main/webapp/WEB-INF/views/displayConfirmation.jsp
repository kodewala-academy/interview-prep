<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Aadhar Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            padding: 30px;
        }
        .confirmation-table {
            width: 50%;
            margin: auto;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .confirmation-table th, .confirmation-table td {
            border: 1px solid #ddd;
            padding: 12px 16px;
            text-align: left;
        }
        .confirmation-table th {
            background-color: #007BFF;
            color: white;
        }
        h2 {
            text-align: center;
            color: #333333;
        }
    </style>
</head>
<body>

    <h2>Aadhar Registration Confirmation</h2>

    <table class="confirmation-table">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>First Name</td>
            <td>${user.firstName}</td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td>${user.mobile}</td>
        </tr>
        <tr>
            <td>Confirmation Ref.</td>
            <td>${user.confirmationNumber}</td>
        </tr>
    </table>

</body>
</html>
