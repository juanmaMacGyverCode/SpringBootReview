import React from "react"

class ListOfVideos extends React.Component {
    constructor(props) {
        super(props)
        this.state = {data: [], error: null}
    }

    async componentDidMount() {
        /* FIX: version incompatibilities */
        try {
            let response = await fetch("/api/videos");

            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }

            const json = await response.json();
            this.setState({data: json});
        } catch (error) {
            console.error("Error fetching data:", error);
            this.setState({ error: "Error fetching data" });
        }
    }

    render() {
        const { data, error } = this.state;

        if (error) {
            return <div>{error}</div>;
        }

        return (
            <ul>
                {data.map((item, index) => (
                    <li key={index}>
                        {item.name}
                    </li>
                ))}
            </ul>
        )
    }
}

export default ListOfVideos