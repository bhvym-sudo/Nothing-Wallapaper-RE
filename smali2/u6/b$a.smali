.class Lu6/b$a;
.super Lg1/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/b;-><init>(Lg1/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lu6/b;Lg1/q;)V
    .registers 3

    invoke-direct {p0, p2}, Lg1/i;-><init>(Lg1/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .registers 1

    const-string p0, "INSERT OR ABORT INTO `wallpaper_studio_history` (`imageId`,`imageUrl`,`filePath`,`subjectEn`,`subjectLoc`,`styleEn`,`styleLoc`,`createTime`) VALUES (?,?,?,?,?,?,?,?)"

    return-object p0
.end method

.method protected bridge synthetic i(Lo1/k;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-virtual {p0, p1, p2}, Lu6/b$a;->k(Lo1/k;Lcom/nothing/wallpaper/db/CreativeWallpaper;)V

    return-void
.end method

.method protected k(Lo1/k;Lcom/nothing/wallpaper/db/CreativeWallpaper;)V
    .registers 5

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v0

    const/4 p0, 0x1

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    if-nez p0, :cond_13

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_1a

    :cond_13
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_1a
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    if-nez p0, :cond_25

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_2c

    :cond_25
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_2c
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectEn()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x4

    if-nez p0, :cond_37

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_3e

    :cond_37
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectEn()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_3e
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectLoc()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x5

    if-nez p0, :cond_49

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_50

    :cond_49
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectLoc()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_50
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleEn()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x6

    if-nez p0, :cond_5b

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_62

    :cond_5b
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleEn()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_62
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleLoc()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x7

    if-nez p0, :cond_6d

    invoke-interface {p1, v0}, Lo1/i;->x0(I)V

    goto :goto_74

    :cond_6d
    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleLoc()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lo1/i;->r(ILjava/lang/String;)V

    :goto_74
    const/16 p0, 0x8

    invoke-virtual {p2}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getCreateTime()J

    move-result-wide v0

    invoke-interface {p1, p0, v0, v1}, Lo1/i;->P(IJ)V

    return-void
.end method
