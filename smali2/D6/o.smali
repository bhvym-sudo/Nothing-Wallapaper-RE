.class public final synthetic LD6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LD6/p;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(LD6/p;J)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/o;->q:LD6/p;

    iput-wide p2, p0, LD6/o;->r:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LD6/o;->q:LD6/p;

    iget-wide v1, p0, LD6/o;->r:J

    invoke-static {v0, v1, v2}, LD6/p;->d(LD6/p;J)Lh8/A;

    move-result-object p0

    return-object p0
.end method
