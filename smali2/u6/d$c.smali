.class Lu6/d$c;
.super Lg1/w;
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

    invoke-direct {p0, p2}, Lg1/w;-><init>(Lg1/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .registers 1

    const-string p0, "UPDATE wallpaper_request_index SET requestIndex=? WHERE subjectPromptId=? and stylePromptId=?"

    return-object p0
.end method
