import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import { ThemeProvider, createTheme } from "@mui/material/styles";
import CssBaseline from "@mui/material/CssBaseline"; // Optional: Normalize styles
import "./index.css"; // Optional: Additional global styles

// Define a custom MUI theme
const theme = createTheme({
  palette: {
    primary: {
      main: "#1976d2", // Customize primary color
    },
    secondary: {
      main: "#ff4081", // Customize secondary color
    },
    background: {
      default: "#f5f5f5", // Customize background color
    },
  },
  typography: {
    fontFamily: '"Roboto", "Helvetica", "Arial", sans-serif',
  },
});

const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <ThemeProvider theme={theme}>
      <CssBaseline />{" "}
      {/* Optional: Provides a consistent baseline for styles */}
      <App />
    </ThemeProvider>
  </React.StrictMode>
);