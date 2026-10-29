.class Lu6/d$b;
.super Lg1/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/d;-><init>(Lg1/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lu6/d;Lg1/q;)V
    .registers 3

    invoke-direct {p0, p2}, Lg1/h;-><init>(Lg1/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .registers 1

    const-string p0, "DELETE FROM `wallpaper_request_index` WHERE `_Id` = ?"

    return-object p0
.end method
