import ReactDOM from "react-dom/client"
import { App } from "./App"

/* FIX: version incompatibilities */
const app = document.getElementById("app")
const root = ReactDOM.createRoot(app)
root.render(<App />)