import React from 'react';
import {
  AppBar,
  Toolbar,
  List,
  ListItem,
  Typography,
  styled,
  ListItemButton,
  ListItemText,
} from '@mui/material';

// personalizacao
const StyledToolbar = styled(Toolbar)({
  display: 'flex',
  justifyContent: 'space-between',
});

const ListMenu = styled(List)(({ theme }) => ({
  display: 'none',
  [theme.breakpoints.up('sm')]: {
    display: 'flex',
  },
}));

//rotas
const itemList = [
  {
    text: 'Home',
    to: '#home',
  },
  {
    text: 'About',
    to: '#about',
  },
  {
    text: 'Contact',
    to: '#contact',
  },
];

const Navbar = () => {
    const handleToolUsClick = () => {
        // Navigasi kembali ke bagian home
        window.location.href = '/';
      };
  return (
    <AppBar component="nav" position="sticky" sx={{ backgroundColor:'#B30101' }} elevation={0}>
      <StyledToolbar>
        <Typography variant="h6" component="h2" 
        onClick={handleToolUsClick}  
        style={{ cursor: 'pointer' }}>
          ToolUS
        </Typography>
        <ListMenu>
          {itemList.map((item) => {
            const { text, to } = item;
            return (
              <ListItem key={text}>
                <ListItemButton
                  component="a"
                  href={to}
                  sx={{
                    color: '#fff',
                    '&:hover': {
                      backgroundColor: 'transparent',
                      color: '#1e2a5a',
                    },
                  }}
                >
                  <ListItemText primary={text} />
                </ListItemButton>
              </ListItem>
            );
          })}
        </ListMenu>
      </StyledToolbar>
    </AppBar>
  );
};

export default Navbar;
