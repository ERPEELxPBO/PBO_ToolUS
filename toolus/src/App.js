// import React, { useState } from "react";
// import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";
// import Footer from "./components/Footer/Footer";
// import DashboardPage from "./components/DashboardPage";
// import LoginForm from "./components/LoginForm";
// import Overview from "./components/Overview";
// import Availability from "./components/Availability";
// import CustomDrawer from "./components/CustomDrawer";
// import { Helmet } from "react-helmet";
// import { ThemeProvider } from "styled-components";
// import Layout from "./components/Layout/Layout";
// import Routes from "./Routes";
// import { GlobalStyle } from "./styles/globalStyles";
// import { darkTheme, lightTheme } from "./styles/theme";

// const menuItems = [
//   { id: 1, name: "Overview", section: "/overview" },
//   { id: 2, name: "Availability", section: "/availability" },
//   // Add more menu items as needed
// ];

// function App() {
//   const [isLoggedIn, setLoggedIn] = useState(false);
//   const [userInfo, setUserInfo] = useState(null);

//   const [theme, setTheme] = useState("light");
//   const themeStyle = theme === "light" ? lightTheme : darkTheme;

//   const handleLogin = (userData) => {
//     setLoggedIn(true);
//     setUserInfo(userData);
//   };

//   const handleLogout = () => {
//     setLoggedIn(false);
//     setUserInfo(null);
//   };

//   return (
//     <>
//       <BrowserRouter>
//         {isLoggedIn && <CustomDrawer menuItems={menuItems} />} {/* Show the drawer only if logged in */}
//         <Routes>
//           <Route path="/" element={<DashboardPage />} />
//           <Route
//             path="/login"
//             element={
//               isLoggedIn ? (
//                 <Navigate to="/overview" /> // Redirect to overview if already logged in
//               ) : (
//                 <LoginForm onLogin={handleLogin} />
//               )
//             }
//           />
//           <Route
//             path="/overview"
//             element={isLoggedIn ? <Overview user={userInfo} onLogout={handleLogout} /> : <Navigate to="/login" />} // Redirect to login if not logged in
//           />
//           <Route path="/availability" element={<Availability />} />
//           {/* Add more routes for other components */}
//         </Routes>
//       </BrowserRouter>
//       <Footer />
//     </>
//   );
// }

// export default App;

import React, { useState } from "react";
import { Helmet } from "react-helmet";
import { ThemeProvider } from "styled-components";
import Layout from "./components/Layout/Layout";
import Routes from "./Routes";
import { GlobalStyle } from "./styles/globalStyles";
import { darkTheme, lightTheme } from "./styles/theme";

export const ThemeContext = React.createContext(null);

const App = () => {
    const [theme, setTheme] = useState("light");
    const themeStyle = theme === "light" ? lightTheme : darkTheme;

    return (
        <ThemeContext.Provider value={{ setTheme, theme }}>
            <ThemeProvider theme={themeStyle}>
                <GlobalStyle />
                <Helmet>
                    <title>Sidebar - Code Focus</title>
                    <link rel="preconnect" href="https://fonts.googleapis.com" />
                    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
                    <link
                        href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap"
                        rel="stylesheet"
                    />
                </Helmet>
                <>
                    <Layout>
                        <Routes />
                    </Layout>
                </>
            </ThemeProvider>
        </ThemeContext.Provider>
    );
};

export default App;