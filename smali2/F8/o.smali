.class public abstract LF8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "RESUME_TOKEN"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/o;->a:LK8/D;

    return-void
.end method
