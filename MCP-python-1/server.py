from mcp.server import FastMCP

# Create MCP server instance
server = FastMCP("my-mcp-server")

@server.tool()
def get_employee_info(name: str) -> dict:
    """Get information about an employee by name.
    Returns name, salary, and email information."""
    return {
        "first_name": name,
        "last_name": "Doe", 
        "salary": 50000,
        "email": f"{name}@company.com"
    }