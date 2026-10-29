.class public final LX8/f$i;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->s1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;)V
    .registers 4

    iput-object p3, p0, LX8/f$i;->e:LX8/f;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-object p0, p0, LX8/f$i;->e:LX8/f;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1, v0}, LX8/f;->B1(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
