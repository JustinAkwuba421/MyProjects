import datetime

# A simple Python script to track packages (like a mini delivery system)
packages = []

def add_package(tracking_id, status, location):
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    package = {
        'tracking_id': tracking_id,
        'status': status,
        'location': location,
        'timestamp': timestamp
    }
    packages.append(package)
    print(f"✅ Added package {tracking_id} with status '{status}' at {location}.")

def update_package(tracking_id, status=None, location=None):
    for package in packages:
        if package['tracking_id'] == tracking_id:
            if status:
                package['status'] = status
            if location:
                package['location'] = location
            package['timestamp'] = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            print(f"🔄 Updated package {tracking_id}: status='{package['status']}', location='{package['location']}'.")
            return
    print(f"⚠️ Package with ID {tracking_id} not found.")

def list_packages():
    if not packages:
        print("📦 No packages found.")
        return
    print("\n--- Package List ---")
    for pkg in packages:
        print(f"ID: {pkg['tracking_id']} | Status: {pkg['status']} | Location: {pkg['location']} | Last Updated: {pkg['timestamp']}")

# Example usage
add_package("123ABC", "In Transit", "Warehouse A")
add_package("456DEF", "Out for Delivery", "Truck 42")
list_packages()
update_package("123ABC", status="Delivered", location="Customer Address")
list_packages()
