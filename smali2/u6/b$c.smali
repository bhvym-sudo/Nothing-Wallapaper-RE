.class Lu6/b$c;
.super Lg1/w;
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

    invoke-direct {p0, p2}, Lg1/w;-><init>(Lg1/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .registers 1

    const-string p0, "DELETE FROM wallpaper_studio_history WHERE createTime IN (SELECT createTime FROM wallpaper_studio_history ORDER BY createTime DESC LIMIT ?,100)"

    return-object p0
.end method
