import React from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { Logo, LogoText, DropdownItem, Item } from 'react-sidebar-ui';
import { Drawer, List, ListItem, ListItemText } from '@mui/material';

const CustomDrawer = ({ menuItems }) => {
  const navigate = useNavigate();

  const handleMenuClick = (section) => {
    // Redirect to the specified section
    navigate(section);
  };

  return (
    <Drawer variant="permanent">
      <List>
        <ListItem>
          <Logo
            image='/logo512.png'  // Ganti sesuai dengan lokasi logo Anda
            imageName='Logo'
            side='left'
          />
        </ListItem>
        <DropdownItem
          values={menuItems.map(item => item.name)}
          bgColor={'black'}
        >
          Menu
        </DropdownItem>

        {menuItems.map((menuItem) => (
          <Item bgColor='black' key={menuItem.id}>
            <ListItemText
              primary={menuItem.name}
              onClick={() => handleMenuClick(menuItem.section)}
            />
          </Item>
        ))}
      </List>
    </Drawer>
  );
};

export default CustomDrawer;
    