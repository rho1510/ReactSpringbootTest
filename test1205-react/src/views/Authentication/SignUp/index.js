import React, {useState} from 'react';
import axios from 'axios';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import {Button} from "@mui/material";

export default function SignUp() {

    const [kakaoNickname, setKakaoNickname] = useState('');
    const [kakaoEmail, setKakaoEmail] = useState('');
    const [kakaoName, setKakaoName] = useState('');
    const [password, setPassword] = useState('');
    const [passwordCheck, setPasswordCheck] = useState('');
    const [kakaoAge, setKakaoAge] = useState('');
    const [kakaoBirthday, setKakaoBirthday] = useState('');

    // const [requestResult, setRequestResult] = useState('');

    const signUpHandler = () => {
        const data = {
            kakaoNickname,
            kakaoEmail,
            kakaoName,
            password,
            passwordCheck,
            kakaoAge,
            kakaoBirthday,
        };
        axios.post('http://localhost:8080/api/auth/signUp', data)
            .then((response) => {
            })
            .catch((error) => {
            });
    };


    return (
        <Card sx={{minWidth: 275, maxWidth: "50vw"}}>
            <CardContent>
                <Box>
                    <TextField fullWidth label="닉네임" variant="standard" onChange={(e) => setKakaoNickname(e.target.value)}/>
                    <TextField fullWidth label="이메일" type="email" variant="standard" onChange={(e) => setKakaoEmail(e.target.value)}/>
                    <TextField fullWidth label="비밀번호" type="password" variant="standard" onChange={(e) => setPassword(e.target.value)}/>
                    <TextField fullWidth label="비밀번호 확인" type="password" variant="standard" onChange={(e) => setPasswordCheck(e.target.value)}/>
                    <TextField fullWidth label="이름" variant="standard" onChange={(e) => setKakaoName(e.target.value)}/>
                    <TextField fullWidth label="나이" variant="standard" onChange={(e) => setKakaoAge(e.target.value)}/>
                    <TextField fullWidth label="생일" variant="standard" onChange={(e) => setKakaoBirthday(e.target.value)}/>
                </Box>
                <CardActions>
                    <Button fullWidth onClick={() => signUpHandler()} variant="contained">회원가입</Button>
                </CardActions>
            </CardContent>
        </Card>
    )
}