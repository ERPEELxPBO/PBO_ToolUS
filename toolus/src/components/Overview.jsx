import React from "react";
import { Link , Navigate } from "react-router-dom";
import "./css/overview.css";

const Overview = ({isLoggedIn}) => {
  if (!isLoggedIn) {
    return <Navigate to="/login" />; // Redirect to login if not logged in
  }

  return (
    <div className="overview">
      <div className="div">
        <div className="overlap">
          <div className="frame">
            <div className="text-wrapper">Overview</div>
            <div className="text-wrapper-2">Haii, Tool Mate!👋✨</div>
            <div className="text-wrapper-3">Welcome Back!</div>
            <div className="frame-2">
              <div className="overlap-group">
                <div className="div-wrapper">
                  <div className="text-wrapper-4">
                    <Link to="/waiting">Waiting</Link>
                  </div>
                </div>
                <div className="text-wrapper-5">10</div>
              </div>
              <div className="div-wrapper">
                <div className="group">
                  <div className="text-wrapper-6">
                    <Link to="/approve">Approve</Link>
                  </div>
                  <div className="text-wrapper-7">10</div>
                </div>
              </div>
              <div className="group-wrapper">
                <div className="group-2">
                  <div className="text-wrapper-8">
                    <Link to="/reject">Reject</Link>
                  </div>
                  <div className="text-wrapper-9">10</div>
                </div>
              </div>
            </div>
          </div>
          <div className="overlap-wrapper">
            <div className="frame-wrapper">
              <div className="frame-3">
                <div className="text-wrapper-10">
                  <Link to="/account-profile">Profile</Link>
                </div>
                <div className="text-wrapper-11">Logout</div>
              </div>
            </div>
          </div>
        </div>
        <div className="frame-4">
          <div className="frame-5">
            <div className="overlap-group-2">
              <img
                className="img"
                src="img/group-5-1.png"
                alt="Dashboard"
              />
              <div className="text-wrapper-12">
                <Link to="/dashboard">Dashboard</Link>
              </div>
            </div>
            <div className="text-wrapper-13">Setting</div>
            <div className="frame-6">
              <div className="text-wrapper-14">
                <Link to="/overview">Overview</Link>
              </div>
            </div>
            <div className="frame-7">
              <div className="text-wrapper-15">
                <Link to="/availability">Availability</Link>
              </div>
            </div>
            <div className="frame-8">
              <div className="text-wrapper-15">
                <Link to="/application-form">Application Form</Link>
              </div>
            </div>
            <div className="frame-9">
              <div className="text-wrapper-15">
                <Link to="/history">History</Link>
              </div>
            </div>
            <div className="frame-10">
              <div className="text-wrapper-15">
                <Link to="/account-profile">Account and Profile</Link>
              </div>
            </div>
            <div className="frame-11">
              <div className="text-wrapper-15">
                <Link to="/help">Help</Link>
              </div>
            </div>
          </div>
        </div>
        <div className="frame-12">
          <div className="frame-13">
            <div className="text-wrapper-16">Fahmi Agung Maulana</div>
            <img
              className="ellipse"
              src="img/ellipse-1.svg"
              alt="Ellipse"
            />
          </div>
        </div>
      </div>
    </div>
  );
};

export default Overview;
