import React, { useEffect } from 'react';
import Header from '../components/Header';
import GetStarted from '../components/GetStarted';
import GetInTouch from '../components/GetInTouch';
import Content from '../components/Content';
import Gallery from '../components/Gallery';
import Details from '../components/Details';
import Navbar from '../components/Navbar';

function DashboardPage() {
  useEffect(() => {
    // Setelah komponen dimuat, navigasi ke bagian home
    document.getElementById('home').scrollIntoView();
  }, []);

  return (
    <div>
      {/* Navigation Bar */}
      <Navbar />

      {/* Home Section */}
      <section id="home">
        <Header />
        {/* <GetStarted />
        <GetInTouch /> */}
      </section>

      {/* About Section */}
      <section id="about">
        {/* <Content /> */}
        <Gallery />
      </section>

      {/* Contact Section */}
      <section id="contact">
        {/* <Details /> */}
      </section>
    </div>
  );
}

export default DashboardPage;
