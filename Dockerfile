FROM broadinstitute/scala-baseimage

RUN mkdir /app
COPY . /app
RUN cat /proc/meminfo
RUN cd app; ./gradlew build --no-daemon --max-workers=1 --debug