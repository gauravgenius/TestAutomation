package utilities;

import redis.clients.jedis.Jedis;

public class RedisConnection {
	
	private String redis_host = null;
	private int redis_port;
	
	public RedisConnection(String host, int port) {
		this.redis_host = host;
		this.redis_port = port;
		
		Jedis conn = new Jedis(redis_host,redis_port);
		conn.isConnected();
		conn.close();
	}
}
