root            /dev/null;
server_name     $hostname;

add_header X-Content-Type-Options nosniff;
add_header X-XSS-Protection "1; mode=block";
add_header X-Robots-Tag none;
add_header Content-Security-Policy "frame-ancestors {{ .proxy_url }}";