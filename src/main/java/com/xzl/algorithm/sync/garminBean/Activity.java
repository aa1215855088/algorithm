/**
  * Copyright 2022 bejson.com 
  */
package com.xzl.algorithm.sync.garminBean;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2022-10-28 16:38:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Activity {

    private long activityId;
    private String activityName;
    private String description;
    private Date startTimeLocal;
    private Date startTimeGMT;
    private ActivityType activityType;
    private EventType eventType;
    private String comments;
    private String parentId;
    private double distance;
    private double duration;
    private double elapsedDuration;
    private int movingDuration;
    private int elevationGain;
    private int elevationLoss;
    private double averageSpeed;
    private double maxSpeed;
    private int startLatitude;
    private int startLongitude;
    private boolean hasPolyline;
    private long ownerId;
    private String ownerDisplayName;
    private String ownerFullName;
    private String ownerProfileImageUrlSmall;
    private String ownerProfileImageUrlMedium;
    private String ownerProfileImageUrlLarge;
    private int calories;
    private int averageHR;
    private int maxHR;
    private String averageRunningCadenceInStepsPerMinute;
    private String maxRunningCadenceInStepsPerMinute;
    private int averageBikingCadenceInRevPerMinute;
    private int maxBikingCadenceInRevPerMinute;
    private String averageSwimCadenceInStrokesPerMinute;
    private String maxSwimCadenceInStrokesPerMinute;
    private String averageSwolf;
    private String activeLengths;
    private String steps;
    private String conversationUuid;
    private String conversationPk;
    private String numberOfActivityLikes;
    private String numberOfActivityComments;
    private String likedByUser;
    private String commentedByUser;
    private String activityLikeDisplayNames;
    private String activityLikeFullNames;
    private String activityLikeProfileImageUrls;
    private String requestorRelationship;
    private List<String> userRoles;
    private Privacy privacy;
    private boolean userPro;
    private String courseId;
    private String poolLength;
    private String unitOfPoolLength;
    private boolean hasVideo;
    private String videoUrl;
    private int timeZoneId;
    private long beginTimestamp;
    private int sportTypeId;
    private int avgPower;
    private int maxPower;
    private String aerobicTrainingEffect;
    private String anaerobicTrainingEffect;
    private int strokes;
    private double normPower;
    private String leftBalance;
    private String rightBalance;
    private String avgLeftBalance;
    private double max20MinPower;
    private String avgVerticalOscillation;
    private String avgGroundContactTime;
    private String avgStrideLength;
    private String avgFractionalCadence;
    private String maxFractionalCadence;
    private String trainingStressScore;
    private String intensityFactor;
    private String vO2MaxValue;
    private String avgVerticalRatio;
    private String avgGroundContactBalance;
    private String lactateThresholdBpm;
    private String lactateThresholdSpeed;
    private String maxFtp;
    private String avgStrokeDistance;
    private String avgStrokeCadence;
    private String maxStrokeCadence;
    private String workoutId;
    private String avgStrokes;
    private String minStrokes;
    private long deviceId;
    private String minTemperature;
    private String maxTemperature;
    private int minElevation;
    private int maxElevation;
    private String avgDoubleCadence;
    private String maxDoubleCadence;
    private String summarizedExerciseSets;
    private String maxDepth;
    private String avgDepth;
    private String surfaceInterval;
    private String startN2;
    private String endN2;
    private String startCns;
    private String endCns;
    private SummarizedDiveInfo summarizedDiveInfo;
    private String activityLikeAuthors;
    private String avgVerticalSpeed;
    private int maxVerticalSpeed;
    private String floorsClimbed;
    private String floorsDescended;
    private String manufacturer;
    private String diveNumber;
    private String locationName;
    private String bottomTime;
    private int lapCount;
    private double endLatitude;
    private double endLongitude;
    private String minAirSpeed;
    private String maxAirSpeed;
    private String avgAirSpeed;
    private String avgWindYawAngle;
    private String minCda;
    private String maxCda;
    private String avgCda;
    private String avgWattsPerCda;
    private String flow;
    private String grit;
    private String jumpCount;
    private String caloriesEstimated;
    private String caloriesConsumed;
    private String waterEstimated;
    private String waterConsumed;
    private int maxAvgPower_1;
    private int maxAvgPower_2;
    private int maxAvgPower_5;
    private int maxAvgPower_10;
    private int maxAvgPower_20;
    private int maxAvgPower_30;
    private int maxAvgPower_60;
    private int maxAvgPower_120;
    private int maxAvgPower_300;
    private int maxAvgPower_600;
    private int maxAvgPower_1200;
    private int maxAvgPower_1800;
    private String maxAvgPower_3600;
    private String maxAvgPower_7200;
    private String maxAvgPower_18000;
    private boolean excludeFromPowerCurveReports;
    private String totalSets;
    private String activeSets;
    private String totalReps;
    private String minRespirationRate;
    private String maxRespirationRate;
    private String avgRespirationRate;
    private String trainingEffectLabel;
    private String activityTrainingLoad;
    private String avgFlow;
    private String avgGrit;
    private double minActivityLapDuration;
    private String avgStress;
    private String startStress;
    private String endStress;
    private String differenceStress;
    private String maxStress;
    private String aerobicTrainingEffectMessage;
    private String anaerobicTrainingEffectMessage;
    private List<SplitSummaries> splitSummaries;
    private boolean hasSplits;
    private String maxBottomTime;
    private String hasSeedFirstbeatProfile;
    private String calendarEventId;
    private String calendarEventUuid;
    private String avgGradeAdjustedSpeed;
    private String avgWheelchairCadence;
    private String maxWheelchairCadence;
    private boolean pr;
    private boolean autoCalcCalories;
    private boolean elevationCorrected;
    private boolean atpActivity;
    private boolean favorite;
    private boolean decoDive;
    private boolean parent;
    private boolean purposeful;
    private boolean manualActivity;
    public void setActivityId(long activityId) {
         this.activityId = activityId;
     }
     public long getActivityId() {
         return activityId;
     }

    public void setActivityName(String activityName) {
         this.activityName = activityName;
     }
     public String getActivityName() {
         return activityName;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setStartTimeLocal(Date startTimeLocal) {
         this.startTimeLocal = startTimeLocal;
     }
     public Date getStartTimeLocal() {
         return startTimeLocal;
     }

    public void setStartTimeGMT(Date startTimeGMT) {
         this.startTimeGMT = startTimeGMT;
     }
     public Date getStartTimeGMT() {
         return startTimeGMT;
     }

    public void setActivityType(ActivityType activityType) {
         this.activityType = activityType;
     }
     public ActivityType getActivityType() {
         return activityType;
     }

    public void setEventType(EventType eventType) {
         this.eventType = eventType;
     }
     public EventType getEventType() {
         return eventType;
     }

    public void setComments(String comments) {
         this.comments = comments;
     }
     public String getComments() {
         return comments;
     }

    public void setParentId(String parentId) {
         this.parentId = parentId;
     }
     public String getParentId() {
         return parentId;
     }

    public void setDistance(double distance) {
         this.distance = distance;
     }
     public double getDistance() {
         return distance;
     }

    public void setDuration(double duration) {
         this.duration = duration;
     }
     public double getDuration() {
         return duration;
     }

    public void setElapsedDuration(double elapsedDuration) {
         this.elapsedDuration = elapsedDuration;
     }
     public double getElapsedDuration() {
         return elapsedDuration;
     }

    public void setMovingDuration(int movingDuration) {
         this.movingDuration = movingDuration;
     }
     public int getMovingDuration() {
         return movingDuration;
     }

    public void setElevationGain(int elevationGain) {
         this.elevationGain = elevationGain;
     }
     public int getElevationGain() {
         return elevationGain;
     }

    public void setElevationLoss(int elevationLoss) {
         this.elevationLoss = elevationLoss;
     }
     public int getElevationLoss() {
         return elevationLoss;
     }

    public void setAverageSpeed(double averageSpeed) {
         this.averageSpeed = averageSpeed;
     }
     public double getAverageSpeed() {
         return averageSpeed;
     }

    public void setMaxSpeed(double maxSpeed) {
         this.maxSpeed = maxSpeed;
     }
     public double getMaxSpeed() {
         return maxSpeed;
     }

    public void setStartLatitude(int startLatitude) {
         this.startLatitude = startLatitude;
     }
     public int getStartLatitude() {
         return startLatitude;
     }

    public void setStartLongitude(int startLongitude) {
         this.startLongitude = startLongitude;
     }
     public int getStartLongitude() {
         return startLongitude;
     }

    public void setHasPolyline(boolean hasPolyline) {
         this.hasPolyline = hasPolyline;
     }
     public boolean getHasPolyline() {
         return hasPolyline;
     }

    public void setOwnerId(long ownerId) {
         this.ownerId = ownerId;
     }
     public long getOwnerId() {
         return ownerId;
     }

    public void setOwnerDisplayName(String ownerDisplayName) {
         this.ownerDisplayName = ownerDisplayName;
     }
     public String getOwnerDisplayName() {
         return ownerDisplayName;
     }

    public void setOwnerFullName(String ownerFullName) {
         this.ownerFullName = ownerFullName;
     }
     public String getOwnerFullName() {
         return ownerFullName;
     }

    public void setOwnerProfileImageUrlSmall(String ownerProfileImageUrlSmall) {
         this.ownerProfileImageUrlSmall = ownerProfileImageUrlSmall;
     }
     public String getOwnerProfileImageUrlSmall() {
         return ownerProfileImageUrlSmall;
     }

    public void setOwnerProfileImageUrlMedium(String ownerProfileImageUrlMedium) {
         this.ownerProfileImageUrlMedium = ownerProfileImageUrlMedium;
     }
     public String getOwnerProfileImageUrlMedium() {
         return ownerProfileImageUrlMedium;
     }

    public void setOwnerProfileImageUrlLarge(String ownerProfileImageUrlLarge) {
         this.ownerProfileImageUrlLarge = ownerProfileImageUrlLarge;
     }
     public String getOwnerProfileImageUrlLarge() {
         return ownerProfileImageUrlLarge;
     }

    public void setCalories(int calories) {
         this.calories = calories;
     }
     public int getCalories() {
         return calories;
     }

    public void setAverageHR(int averageHR) {
         this.averageHR = averageHR;
     }
     public int getAverageHR() {
         return averageHR;
     }

    public void setMaxHR(int maxHR) {
         this.maxHR = maxHR;
     }
     public int getMaxHR() {
         return maxHR;
     }

    public void setAverageRunningCadenceInStepsPerMinute(String averageRunningCadenceInStepsPerMinute) {
         this.averageRunningCadenceInStepsPerMinute = averageRunningCadenceInStepsPerMinute;
     }
     public String getAverageRunningCadenceInStepsPerMinute() {
         return averageRunningCadenceInStepsPerMinute;
     }

    public void setMaxRunningCadenceInStepsPerMinute(String maxRunningCadenceInStepsPerMinute) {
         this.maxRunningCadenceInStepsPerMinute = maxRunningCadenceInStepsPerMinute;
     }
     public String getMaxRunningCadenceInStepsPerMinute() {
         return maxRunningCadenceInStepsPerMinute;
     }

    public void setAverageBikingCadenceInRevPerMinute(int averageBikingCadenceInRevPerMinute) {
         this.averageBikingCadenceInRevPerMinute = averageBikingCadenceInRevPerMinute;
     }
     public int getAverageBikingCadenceInRevPerMinute() {
         return averageBikingCadenceInRevPerMinute;
     }

    public void setMaxBikingCadenceInRevPerMinute(int maxBikingCadenceInRevPerMinute) {
         this.maxBikingCadenceInRevPerMinute = maxBikingCadenceInRevPerMinute;
     }
     public int getMaxBikingCadenceInRevPerMinute() {
         return maxBikingCadenceInRevPerMinute;
     }

    public void setAverageSwimCadenceInStrokesPerMinute(String averageSwimCadenceInStrokesPerMinute) {
         this.averageSwimCadenceInStrokesPerMinute = averageSwimCadenceInStrokesPerMinute;
     }
     public String getAverageSwimCadenceInStrokesPerMinute() {
         return averageSwimCadenceInStrokesPerMinute;
     }

    public void setMaxSwimCadenceInStrokesPerMinute(String maxSwimCadenceInStrokesPerMinute) {
         this.maxSwimCadenceInStrokesPerMinute = maxSwimCadenceInStrokesPerMinute;
     }
     public String getMaxSwimCadenceInStrokesPerMinute() {
         return maxSwimCadenceInStrokesPerMinute;
     }

    public void setAverageSwolf(String averageSwolf) {
         this.averageSwolf = averageSwolf;
     }
     public String getAverageSwolf() {
         return averageSwolf;
     }

    public void setActiveLengths(String activeLengths) {
         this.activeLengths = activeLengths;
     }
     public String getActiveLengths() {
         return activeLengths;
     }

    public void setSteps(String steps) {
         this.steps = steps;
     }
     public String getSteps() {
         return steps;
     }

    public void setConversationUuid(String conversationUuid) {
         this.conversationUuid = conversationUuid;
     }
     public String getConversationUuid() {
         return conversationUuid;
     }

    public void setConversationPk(String conversationPk) {
         this.conversationPk = conversationPk;
     }
     public String getConversationPk() {
         return conversationPk;
     }

    public void setNumberOfActivityLikes(String numberOfActivityLikes) {
         this.numberOfActivityLikes = numberOfActivityLikes;
     }
     public String getNumberOfActivityLikes() {
         return numberOfActivityLikes;
     }

    public void setNumberOfActivityComments(String numberOfActivityComments) {
         this.numberOfActivityComments = numberOfActivityComments;
     }
     public String getNumberOfActivityComments() {
         return numberOfActivityComments;
     }

    public void setLikedByUser(String likedByUser) {
         this.likedByUser = likedByUser;
     }
     public String getLikedByUser() {
         return likedByUser;
     }

    public void setCommentedByUser(String commentedByUser) {
         this.commentedByUser = commentedByUser;
     }
     public String getCommentedByUser() {
         return commentedByUser;
     }

    public void setActivityLikeDisplayNames(String activityLikeDisplayNames) {
         this.activityLikeDisplayNames = activityLikeDisplayNames;
     }
     public String getActivityLikeDisplayNames() {
         return activityLikeDisplayNames;
     }

    public void setActivityLikeFullNames(String activityLikeFullNames) {
         this.activityLikeFullNames = activityLikeFullNames;
     }
     public String getActivityLikeFullNames() {
         return activityLikeFullNames;
     }

    public void setActivityLikeProfileImageUrls(String activityLikeProfileImageUrls) {
         this.activityLikeProfileImageUrls = activityLikeProfileImageUrls;
     }
     public String getActivityLikeProfileImageUrls() {
         return activityLikeProfileImageUrls;
     }

    public void setRequestorRelationship(String requestorRelationship) {
         this.requestorRelationship = requestorRelationship;
     }
     public String getRequestorRelationship() {
         return requestorRelationship;
     }

    public void setUserRoles(List<String> userRoles) {
         this.userRoles = userRoles;
     }
     public List<String> getUserRoles() {
         return userRoles;
     }

    public void setPrivacy(Privacy privacy) {
         this.privacy = privacy;
     }
     public Privacy getPrivacy() {
         return privacy;
     }

    public void setUserPro(boolean userPro) {
         this.userPro = userPro;
     }
     public boolean getUserPro() {
         return userPro;
     }

    public void setCourseId(String courseId) {
         this.courseId = courseId;
     }
     public String getCourseId() {
         return courseId;
     }

    public void setPoolLength(String poolLength) {
         this.poolLength = poolLength;
     }
     public String getPoolLength() {
         return poolLength;
     }

    public void setUnitOfPoolLength(String unitOfPoolLength) {
         this.unitOfPoolLength = unitOfPoolLength;
     }
     public String getUnitOfPoolLength() {
         return unitOfPoolLength;
     }

    public void setHasVideo(boolean hasVideo) {
         this.hasVideo = hasVideo;
     }
     public boolean getHasVideo() {
         return hasVideo;
     }

    public void setVideoUrl(String videoUrl) {
         this.videoUrl = videoUrl;
     }
     public String getVideoUrl() {
         return videoUrl;
     }

    public void setTimeZoneId(int timeZoneId) {
         this.timeZoneId = timeZoneId;
     }
     public int getTimeZoneId() {
         return timeZoneId;
     }

    public void setBeginTimestamp(long beginTimestamp) {
         this.beginTimestamp = beginTimestamp;
     }
     public long getBeginTimestamp() {
         return beginTimestamp;
     }

    public void setSportTypeId(int sportTypeId) {
         this.sportTypeId = sportTypeId;
     }
     public int getSportTypeId() {
         return sportTypeId;
     }

    public void setAvgPower(int avgPower) {
         this.avgPower = avgPower;
     }
     public int getAvgPower() {
         return avgPower;
     }

    public void setMaxPower(int maxPower) {
         this.maxPower = maxPower;
     }
     public int getMaxPower() {
         return maxPower;
     }

    public void setAerobicTrainingEffect(String aerobicTrainingEffect) {
         this.aerobicTrainingEffect = aerobicTrainingEffect;
     }
     public String getAerobicTrainingEffect() {
         return aerobicTrainingEffect;
     }

    public void setAnaerobicTrainingEffect(String anaerobicTrainingEffect) {
         this.anaerobicTrainingEffect = anaerobicTrainingEffect;
     }
     public String getAnaerobicTrainingEffect() {
         return anaerobicTrainingEffect;
     }

    public void setStrokes(int strokes) {
         this.strokes = strokes;
     }
     public int getStrokes() {
         return strokes;
     }

    public void setNormPower(double normPower) {
         this.normPower = normPower;
     }
     public double getNormPower() {
         return normPower;
     }

    public void setLeftBalance(String leftBalance) {
         this.leftBalance = leftBalance;
     }
     public String getLeftBalance() {
         return leftBalance;
     }

    public void setRightBalance(String rightBalance) {
         this.rightBalance = rightBalance;
     }
     public String getRightBalance() {
         return rightBalance;
     }

    public void setAvgLeftBalance(String avgLeftBalance) {
         this.avgLeftBalance = avgLeftBalance;
     }
     public String getAvgLeftBalance() {
         return avgLeftBalance;
     }

    public void setMax20MinPower(double max20MinPower) {
         this.max20MinPower = max20MinPower;
     }
     public double getMax20MinPower() {
         return max20MinPower;
     }

    public void setAvgVerticalOscillation(String avgVerticalOscillation) {
         this.avgVerticalOscillation = avgVerticalOscillation;
     }
     public String getAvgVerticalOscillation() {
         return avgVerticalOscillation;
     }

    public void setAvgGroundContactTime(String avgGroundContactTime) {
         this.avgGroundContactTime = avgGroundContactTime;
     }
     public String getAvgGroundContactTime() {
         return avgGroundContactTime;
     }

    public void setAvgStrideLength(String avgStrideLength) {
         this.avgStrideLength = avgStrideLength;
     }
     public String getAvgStrideLength() {
         return avgStrideLength;
     }

    public void setAvgFractionalCadence(String avgFractionalCadence) {
         this.avgFractionalCadence = avgFractionalCadence;
     }
     public String getAvgFractionalCadence() {
         return avgFractionalCadence;
     }

    public void setMaxFractionalCadence(String maxFractionalCadence) {
         this.maxFractionalCadence = maxFractionalCadence;
     }
     public String getMaxFractionalCadence() {
         return maxFractionalCadence;
     }

    public void setTrainingStressScore(String trainingStressScore) {
         this.trainingStressScore = trainingStressScore;
     }
     public String getTrainingStressScore() {
         return trainingStressScore;
     }

    public void setIntensityFactor(String intensityFactor) {
         this.intensityFactor = intensityFactor;
     }
     public String getIntensityFactor() {
         return intensityFactor;
     }

    public void setVO2MaxValue(String vO2MaxValue) {
         this.vO2MaxValue = vO2MaxValue;
     }
     public String getVO2MaxValue() {
         return vO2MaxValue;
     }

    public void setAvgVerticalRatio(String avgVerticalRatio) {
         this.avgVerticalRatio = avgVerticalRatio;
     }
     public String getAvgVerticalRatio() {
         return avgVerticalRatio;
     }

    public void setAvgGroundContactBalance(String avgGroundContactBalance) {
         this.avgGroundContactBalance = avgGroundContactBalance;
     }
     public String getAvgGroundContactBalance() {
         return avgGroundContactBalance;
     }

    public void setLactateThresholdBpm(String lactateThresholdBpm) {
         this.lactateThresholdBpm = lactateThresholdBpm;
     }
     public String getLactateThresholdBpm() {
         return lactateThresholdBpm;
     }

    public void setLactateThresholdSpeed(String lactateThresholdSpeed) {
         this.lactateThresholdSpeed = lactateThresholdSpeed;
     }
     public String getLactateThresholdSpeed() {
         return lactateThresholdSpeed;
     }

    public void setMaxFtp(String maxFtp) {
         this.maxFtp = maxFtp;
     }
     public String getMaxFtp() {
         return maxFtp;
     }

    public void setAvgStrokeDistance(String avgStrokeDistance) {
         this.avgStrokeDistance = avgStrokeDistance;
     }
     public String getAvgStrokeDistance() {
         return avgStrokeDistance;
     }

    public void setAvgStrokeCadence(String avgStrokeCadence) {
         this.avgStrokeCadence = avgStrokeCadence;
     }
     public String getAvgStrokeCadence() {
         return avgStrokeCadence;
     }

    public void setMaxStrokeCadence(String maxStrokeCadence) {
         this.maxStrokeCadence = maxStrokeCadence;
     }
     public String getMaxStrokeCadence() {
         return maxStrokeCadence;
     }

    public void setWorkoutId(String workoutId) {
         this.workoutId = workoutId;
     }
     public String getWorkoutId() {
         return workoutId;
     }

    public void setAvgStrokes(String avgStrokes) {
         this.avgStrokes = avgStrokes;
     }
     public String getAvgStrokes() {
         return avgStrokes;
     }

    public void setMinStrokes(String minStrokes) {
         this.minStrokes = minStrokes;
     }
     public String getMinStrokes() {
         return minStrokes;
     }

    public void setDeviceId(long deviceId) {
         this.deviceId = deviceId;
     }
     public long getDeviceId() {
         return deviceId;
     }

    public void setMinTemperature(String minTemperature) {
         this.minTemperature = minTemperature;
     }
     public String getMinTemperature() {
         return minTemperature;
     }

    public void setMaxTemperature(String maxTemperature) {
         this.maxTemperature = maxTemperature;
     }
     public String getMaxTemperature() {
         return maxTemperature;
     }

    public void setMinElevation(int minElevation) {
         this.minElevation = minElevation;
     }
     public int getMinElevation() {
         return minElevation;
     }

    public void setMaxElevation(int maxElevation) {
         this.maxElevation = maxElevation;
     }
     public int getMaxElevation() {
         return maxElevation;
     }

    public void setAvgDoubleCadence(String avgDoubleCadence) {
         this.avgDoubleCadence = avgDoubleCadence;
     }
     public String getAvgDoubleCadence() {
         return avgDoubleCadence;
     }

    public void setMaxDoubleCadence(String maxDoubleCadence) {
         this.maxDoubleCadence = maxDoubleCadence;
     }
     public String getMaxDoubleCadence() {
         return maxDoubleCadence;
     }

    public void setSummarizedExerciseSets(String summarizedExerciseSets) {
         this.summarizedExerciseSets = summarizedExerciseSets;
     }
     public String getSummarizedExerciseSets() {
         return summarizedExerciseSets;
     }

    public void setMaxDepth(String maxDepth) {
         this.maxDepth = maxDepth;
     }
     public String getMaxDepth() {
         return maxDepth;
     }

    public void setAvgDepth(String avgDepth) {
         this.avgDepth = avgDepth;
     }
     public String getAvgDepth() {
         return avgDepth;
     }

    public void setSurfaceInterval(String surfaceInterval) {
         this.surfaceInterval = surfaceInterval;
     }
     public String getSurfaceInterval() {
         return surfaceInterval;
     }

    public void setStartN2(String startN2) {
         this.startN2 = startN2;
     }
     public String getStartN2() {
         return startN2;
     }

    public void setEndN2(String endN2) {
         this.endN2 = endN2;
     }
     public String getEndN2() {
         return endN2;
     }

    public void setStartCns(String startCns) {
         this.startCns = startCns;
     }
     public String getStartCns() {
         return startCns;
     }

    public void setEndCns(String endCns) {
         this.endCns = endCns;
     }
     public String getEndCns() {
         return endCns;
     }

    public void setSummarizedDiveInfo(SummarizedDiveInfo summarizedDiveInfo) {
         this.summarizedDiveInfo = summarizedDiveInfo;
     }
     public SummarizedDiveInfo getSummarizedDiveInfo() {
         return summarizedDiveInfo;
     }

    public void setActivityLikeAuthors(String activityLikeAuthors) {
         this.activityLikeAuthors = activityLikeAuthors;
     }
     public String getActivityLikeAuthors() {
         return activityLikeAuthors;
     }

    public void setAvgVerticalSpeed(String avgVerticalSpeed) {
         this.avgVerticalSpeed = avgVerticalSpeed;
     }
     public String getAvgVerticalSpeed() {
         return avgVerticalSpeed;
     }

    public void setMaxVerticalSpeed(int maxVerticalSpeed) {
         this.maxVerticalSpeed = maxVerticalSpeed;
     }
     public int getMaxVerticalSpeed() {
         return maxVerticalSpeed;
     }

    public void setFloorsClimbed(String floorsClimbed) {
         this.floorsClimbed = floorsClimbed;
     }
     public String getFloorsClimbed() {
         return floorsClimbed;
     }

    public void setFloorsDescended(String floorsDescended) {
         this.floorsDescended = floorsDescended;
     }
     public String getFloorsDescended() {
         return floorsDescended;
     }

    public void setManufacturer(String manufacturer) {
         this.manufacturer = manufacturer;
     }
     public String getManufacturer() {
         return manufacturer;
     }

    public void setDiveNumber(String diveNumber) {
         this.diveNumber = diveNumber;
     }
     public String getDiveNumber() {
         return diveNumber;
     }

    public void setLocationName(String locationName) {
         this.locationName = locationName;
     }
     public String getLocationName() {
         return locationName;
     }

    public void setBottomTime(String bottomTime) {
         this.bottomTime = bottomTime;
     }
     public String getBottomTime() {
         return bottomTime;
     }

    public void setLapCount(int lapCount) {
         this.lapCount = lapCount;
     }
     public int getLapCount() {
         return lapCount;
     }

    public void setEndLatitude(double endLatitude) {
         this.endLatitude = endLatitude;
     }
     public double getEndLatitude() {
         return endLatitude;
     }

    public void setEndLongitude(double endLongitude) {
         this.endLongitude = endLongitude;
     }
     public double getEndLongitude() {
         return endLongitude;
     }

    public void setMinAirSpeed(String minAirSpeed) {
         this.minAirSpeed = minAirSpeed;
     }
     public String getMinAirSpeed() {
         return minAirSpeed;
     }

    public void setMaxAirSpeed(String maxAirSpeed) {
         this.maxAirSpeed = maxAirSpeed;
     }
     public String getMaxAirSpeed() {
         return maxAirSpeed;
     }

    public void setAvgAirSpeed(String avgAirSpeed) {
         this.avgAirSpeed = avgAirSpeed;
     }
     public String getAvgAirSpeed() {
         return avgAirSpeed;
     }

    public void setAvgWindYawAngle(String avgWindYawAngle) {
         this.avgWindYawAngle = avgWindYawAngle;
     }
     public String getAvgWindYawAngle() {
         return avgWindYawAngle;
     }

    public void setMinCda(String minCda) {
         this.minCda = minCda;
     }
     public String getMinCda() {
         return minCda;
     }

    public void setMaxCda(String maxCda) {
         this.maxCda = maxCda;
     }
     public String getMaxCda() {
         return maxCda;
     }

    public void setAvgCda(String avgCda) {
         this.avgCda = avgCda;
     }
     public String getAvgCda() {
         return avgCda;
     }

    public void setAvgWattsPerCda(String avgWattsPerCda) {
         this.avgWattsPerCda = avgWattsPerCda;
     }
     public String getAvgWattsPerCda() {
         return avgWattsPerCda;
     }

    public void setFlow(String flow) {
         this.flow = flow;
     }
     public String getFlow() {
         return flow;
     }

    public void setGrit(String grit) {
         this.grit = grit;
     }
     public String getGrit() {
         return grit;
     }

    public void setJumpCount(String jumpCount) {
         this.jumpCount = jumpCount;
     }
     public String getJumpCount() {
         return jumpCount;
     }

    public void setCaloriesEstimated(String caloriesEstimated) {
         this.caloriesEstimated = caloriesEstimated;
     }
     public String getCaloriesEstimated() {
         return caloriesEstimated;
     }

    public void setCaloriesConsumed(String caloriesConsumed) {
         this.caloriesConsumed = caloriesConsumed;
     }
     public String getCaloriesConsumed() {
         return caloriesConsumed;
     }

    public void setWaterEstimated(String waterEstimated) {
         this.waterEstimated = waterEstimated;
     }
     public String getWaterEstimated() {
         return waterEstimated;
     }

    public void setWaterConsumed(String waterConsumed) {
         this.waterConsumed = waterConsumed;
     }
     public String getWaterConsumed() {
         return waterConsumed;
     }

    public void setMaxAvgPower_1(int maxAvgPower_1) {
         this.maxAvgPower_1 = maxAvgPower_1;
     }
     public int getMaxAvgPower_1() {
         return maxAvgPower_1;
     }

    public void setMaxAvgPower_2(int maxAvgPower_2) {
         this.maxAvgPower_2 = maxAvgPower_2;
     }
     public int getMaxAvgPower_2() {
         return maxAvgPower_2;
     }

    public void setMaxAvgPower_5(int maxAvgPower_5) {
         this.maxAvgPower_5 = maxAvgPower_5;
     }
     public int getMaxAvgPower_5() {
         return maxAvgPower_5;
     }

    public void setMaxAvgPower_10(int maxAvgPower_10) {
         this.maxAvgPower_10 = maxAvgPower_10;
     }
     public int getMaxAvgPower_10() {
         return maxAvgPower_10;
     }

    public void setMaxAvgPower_20(int maxAvgPower_20) {
         this.maxAvgPower_20 = maxAvgPower_20;
     }
     public int getMaxAvgPower_20() {
         return maxAvgPower_20;
     }

    public void setMaxAvgPower_30(int maxAvgPower_30) {
         this.maxAvgPower_30 = maxAvgPower_30;
     }
     public int getMaxAvgPower_30() {
         return maxAvgPower_30;
     }

    public void setMaxAvgPower_60(int maxAvgPower_60) {
         this.maxAvgPower_60 = maxAvgPower_60;
     }
     public int getMaxAvgPower_60() {
         return maxAvgPower_60;
     }

    public void setMaxAvgPower_120(int maxAvgPower_120) {
         this.maxAvgPower_120 = maxAvgPower_120;
     }
     public int getMaxAvgPower_120() {
         return maxAvgPower_120;
     }

    public void setMaxAvgPower_300(int maxAvgPower_300) {
         this.maxAvgPower_300 = maxAvgPower_300;
     }
     public int getMaxAvgPower_300() {
         return maxAvgPower_300;
     }

    public void setMaxAvgPower_600(int maxAvgPower_600) {
         this.maxAvgPower_600 = maxAvgPower_600;
     }
     public int getMaxAvgPower_600() {
         return maxAvgPower_600;
     }

    public void setMaxAvgPower_1200(int maxAvgPower_1200) {
         this.maxAvgPower_1200 = maxAvgPower_1200;
     }
     public int getMaxAvgPower_1200() {
         return maxAvgPower_1200;
     }

    public void setMaxAvgPower_1800(int maxAvgPower_1800) {
         this.maxAvgPower_1800 = maxAvgPower_1800;
     }
     public int getMaxAvgPower_1800() {
         return maxAvgPower_1800;
     }

    public void setMaxAvgPower_3600(String maxAvgPower_3600) {
         this.maxAvgPower_3600 = maxAvgPower_3600;
     }
     public String getMaxAvgPower_3600() {
         return maxAvgPower_3600;
     }

    public void setMaxAvgPower_7200(String maxAvgPower_7200) {
         this.maxAvgPower_7200 = maxAvgPower_7200;
     }
     public String getMaxAvgPower_7200() {
         return maxAvgPower_7200;
     }

    public void setMaxAvgPower_18000(String maxAvgPower_18000) {
         this.maxAvgPower_18000 = maxAvgPower_18000;
     }
     public String getMaxAvgPower_18000() {
         return maxAvgPower_18000;
     }

    public void setExcludeFromPowerCurveReports(boolean excludeFromPowerCurveReports) {
         this.excludeFromPowerCurveReports = excludeFromPowerCurveReports;
     }
     public boolean getExcludeFromPowerCurveReports() {
         return excludeFromPowerCurveReports;
     }

    public void setTotalSets(String totalSets) {
         this.totalSets = totalSets;
     }
     public String getTotalSets() {
         return totalSets;
     }

    public void setActiveSets(String activeSets) {
         this.activeSets = activeSets;
     }
     public String getActiveSets() {
         return activeSets;
     }

    public void setTotalReps(String totalReps) {
         this.totalReps = totalReps;
     }
     public String getTotalReps() {
         return totalReps;
     }

    public void setMinRespirationRate(String minRespirationRate) {
         this.minRespirationRate = minRespirationRate;
     }
     public String getMinRespirationRate() {
         return minRespirationRate;
     }

    public void setMaxRespirationRate(String maxRespirationRate) {
         this.maxRespirationRate = maxRespirationRate;
     }
     public String getMaxRespirationRate() {
         return maxRespirationRate;
     }

    public void setAvgRespirationRate(String avgRespirationRate) {
         this.avgRespirationRate = avgRespirationRate;
     }
     public String getAvgRespirationRate() {
         return avgRespirationRate;
     }

    public void setTrainingEffectLabel(String trainingEffectLabel) {
         this.trainingEffectLabel = trainingEffectLabel;
     }
     public String getTrainingEffectLabel() {
         return trainingEffectLabel;
     }

    public void setActivityTrainingLoad(String activityTrainingLoad) {
         this.activityTrainingLoad = activityTrainingLoad;
     }
     public String getActivityTrainingLoad() {
         return activityTrainingLoad;
     }

    public void setAvgFlow(String avgFlow) {
         this.avgFlow = avgFlow;
     }
     public String getAvgFlow() {
         return avgFlow;
     }

    public void setAvgGrit(String avgGrit) {
         this.avgGrit = avgGrit;
     }
     public String getAvgGrit() {
         return avgGrit;
     }

    public void setMinActivityLapDuration(double minActivityLapDuration) {
         this.minActivityLapDuration = minActivityLapDuration;
     }
     public double getMinActivityLapDuration() {
         return minActivityLapDuration;
     }

    public void setAvgStress(String avgStress) {
         this.avgStress = avgStress;
     }
     public String getAvgStress() {
         return avgStress;
     }

    public void setStartStress(String startStress) {
         this.startStress = startStress;
     }
     public String getStartStress() {
         return startStress;
     }

    public void setEndStress(String endStress) {
         this.endStress = endStress;
     }
     public String getEndStress() {
         return endStress;
     }

    public void setDifferenceStress(String differenceStress) {
         this.differenceStress = differenceStress;
     }
     public String getDifferenceStress() {
         return differenceStress;
     }

    public void setMaxStress(String maxStress) {
         this.maxStress = maxStress;
     }
     public String getMaxStress() {
         return maxStress;
     }

    public void setAerobicTrainingEffectMessage(String aerobicTrainingEffectMessage) {
         this.aerobicTrainingEffectMessage = aerobicTrainingEffectMessage;
     }
     public String getAerobicTrainingEffectMessage() {
         return aerobicTrainingEffectMessage;
     }

    public void setAnaerobicTrainingEffectMessage(String anaerobicTrainingEffectMessage) {
         this.anaerobicTrainingEffectMessage = anaerobicTrainingEffectMessage;
     }
     public String getAnaerobicTrainingEffectMessage() {
         return anaerobicTrainingEffectMessage;
     }

    public void setSplitSummaries(List<SplitSummaries> splitSummaries) {
         this.splitSummaries = splitSummaries;
     }
     public List<SplitSummaries> getSplitSummaries() {
         return splitSummaries;
     }

    public void setHasSplits(boolean hasSplits) {
         this.hasSplits = hasSplits;
     }
     public boolean getHasSplits() {
         return hasSplits;
     }

    public void setMaxBottomTime(String maxBottomTime) {
         this.maxBottomTime = maxBottomTime;
     }
     public String getMaxBottomTime() {
         return maxBottomTime;
     }

    public void setHasSeedFirstbeatProfile(String hasSeedFirstbeatProfile) {
         this.hasSeedFirstbeatProfile = hasSeedFirstbeatProfile;
     }
     public String getHasSeedFirstbeatProfile() {
         return hasSeedFirstbeatProfile;
     }

    public void setCalendarEventId(String calendarEventId) {
         this.calendarEventId = calendarEventId;
     }
     public String getCalendarEventId() {
         return calendarEventId;
     }

    public void setCalendarEventUuid(String calendarEventUuid) {
         this.calendarEventUuid = calendarEventUuid;
     }
     public String getCalendarEventUuid() {
         return calendarEventUuid;
     }

    public void setAvgGradeAdjustedSpeed(String avgGradeAdjustedSpeed) {
         this.avgGradeAdjustedSpeed = avgGradeAdjustedSpeed;
     }
     public String getAvgGradeAdjustedSpeed() {
         return avgGradeAdjustedSpeed;
     }

    public void setAvgWheelchairCadence(String avgWheelchairCadence) {
         this.avgWheelchairCadence = avgWheelchairCadence;
     }
     public String getAvgWheelchairCadence() {
         return avgWheelchairCadence;
     }

    public void setMaxWheelchairCadence(String maxWheelchairCadence) {
         this.maxWheelchairCadence = maxWheelchairCadence;
     }
     public String getMaxWheelchairCadence() {
         return maxWheelchairCadence;
     }

    public void setPr(boolean pr) {
         this.pr = pr;
     }
     public boolean getPr() {
         return pr;
     }

    public void setAutoCalcCalories(boolean autoCalcCalories) {
         this.autoCalcCalories = autoCalcCalories;
     }
     public boolean getAutoCalcCalories() {
         return autoCalcCalories;
     }

    public void setElevationCorrected(boolean elevationCorrected) {
         this.elevationCorrected = elevationCorrected;
     }
     public boolean getElevationCorrected() {
         return elevationCorrected;
     }

    public void setAtpActivity(boolean atpActivity) {
         this.atpActivity = atpActivity;
     }
     public boolean getAtpActivity() {
         return atpActivity;
     }

    public void setFavorite(boolean favorite) {
         this.favorite = favorite;
     }
     public boolean getFavorite() {
         return favorite;
     }

    public void setDecoDive(boolean decoDive) {
         this.decoDive = decoDive;
     }
     public boolean getDecoDive() {
         return decoDive;
     }

    public void setParent(boolean parent) {
         this.parent = parent;
     }
     public boolean getParent() {
         return parent;
     }

    public void setPurposeful(boolean purposeful) {
         this.purposeful = purposeful;
     }
     public boolean getPurposeful() {
         return purposeful;
     }

    public void setManualActivity(boolean manualActivity) {
         this.manualActivity = manualActivity;
     }
     public boolean getManualActivity() {
         return manualActivity;
     }

}