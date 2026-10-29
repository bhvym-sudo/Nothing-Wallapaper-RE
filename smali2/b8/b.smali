.class public Lb8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb8/b;->a:I

    const-string v0, "2021-01-01"

    iput-object v0, p0, Lb8/b;->b:Ljava/lang/String;

    const-string v0, "game haptic"

    iput-object v0, p0, Lb8/b;->c:Ljava/lang/String;

    return-void
.end method
