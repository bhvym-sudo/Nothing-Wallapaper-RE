.class public abstract LJ8/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK8/D;

.field public static final b:LK8/D;

.field public static final c:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ8/t;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ8/t;->b:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ8/t;->c:LK8/D;

    return-void
.end method
