import React from 'react'
import { users } from '../users';

// import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';


import { Link } from 'react-router-dom'
import {  
    Box,
    Button,
    Stack,
    TextField
} from '@mui/material'
import Title from './Title'
import Paragraph from './Paragraph'
import Navbar from './Navbar'

const LoginForm = ({ onLogin }) => {

    const handleSubmit = (event) => {
        event.preventDefault();
        const data = new FormData(event.currentTarget);
        const enteredNIM = data.get('NIM');
        const enteredPassword = data.get('password');

        // Melakukan pencarian pengguna berdasarkan NIM
        const user = users.find((user) => user.nim === enteredNIM);
        print(user)

        if (user && user.password === enteredPassword) {
        // Jika pengguna ditemukan dan password sesuai, panggil onLogin dengan data pengguna
        onLogin({ nim: user.nim, name: user.name });
        console.log('Login Berhasil. Selamat Datang.');
        } else {
        // Jika pengguna tidak ditemukan atau password tidak sesuai, lakukan sesuatu (misalnya, tampilkan pesan kesalahan)
        console.log('Login Gagal. NIM atau password salah.');
        }
    }


    return (
        <div>
        {/* Navigation Bar */}
      <Navbar />
        <Stack 
        component='section'
        direction="column"
        justifyContent= 'center'
        alignItems='center'
        sx={{
            py: 10,
            px: 2,
        }}
        >
            <Title 
            text={
                'LOGIN'
                } 
            textAlign={'center'}
            />
            <Paragraph 
            text={
                'Silakan Login dengan NIM dan Password anda.'
            }
            maxWidth = {'sm'}
            mx={0}
            textAlign={'center'}
            />

            <Box 
            component="form" 
            noValidate 
            onSubmit={handleSubmit} 
            sx={{ 
                mt: 1,
                py: 2
            }}>
                <TextField
                    margin="normal"
                    required
                    fullWidth
                    id="NIM"
                    label="NIM"
                    name="NIM"
                    autoComplete="NIM"
                    autoFocus
                />
                <TextField
                    margin="normal"
                    required
                    fullWidth
                    name="password"
                    label="Password"
                    type="password"
                    id="password"
                    autoComplete="Password"
                    
                />
                <Button 
                variant="contained" 
                fullWidth
                type="submit"
                size="medium"
                component={Link} 
                    to={'/overview'}
                sx= {{ 
                    fontSize: '0.9rem',
                    textTransform: 'capitalize', 
                    py: 2,
                    mt: 3, 
                    mb: 2,
                    borderRadius: 0,
                    backgroundColor: '#14192d',
                    "&:hover": {
                        backgroundColor: '#1e2a5a',
                    }
                }}
                >
                    Login
                </Button>
            </Box>
        </Stack>
        </div>
    )
}

export default LoginForm;