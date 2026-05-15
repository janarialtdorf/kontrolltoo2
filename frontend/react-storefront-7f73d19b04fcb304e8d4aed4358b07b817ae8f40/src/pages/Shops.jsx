import React, { useEffect, useState } from "react";

function Shops() {
  const [shops, setShops] = useState([]);

  useEffect(() => {
    async function fetchShops() {
      try {
        const res = await fetch("http://localhost:5050/shops");
        const data = await res.json();
        setShops(data);
      } catch (e) {
        console.error("Unable to fetch", e);
      }
    }

    fetchShops();
  }, []);

  return (
    <div className="flex flex-col gap-6 pt-4">
      <h1 className="text-xl font-semibold">Our shops</h1>
      <div className="flex flex-col gap-2">
        {shops.map((shop, index) => (
          <div key={index} className="p-2 border rounded">
            {JSON.stringify(shop)}
          </div>
        ))}
      </div>
    </div>
  );
}

export default Shops;