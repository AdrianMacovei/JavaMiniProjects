public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaOfWall = height * width;
        double areaRemain = areaOfWall - areaPerBucket * extraBuckets;
        double result = areaRemain/areaPerBucket;
        return  (int)Math.ceil(result);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaOfWall = height * width;
        double result = areaOfWall/areaPerBucket;
        return (int) Math.ceil(result);
    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket) {
        if (areaOfWall <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double result = areaOfWall/areaPerBucket;
        return (int) Math.ceil(result);
    }
}
