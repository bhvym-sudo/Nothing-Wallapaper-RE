.class final LI8/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI8/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final q:LI8/F;

.field public r:J

.field public final s:Ljava/lang/Object;

.field public final t:Lm8/e;


# direct methods
.method public constructor <init>(LI8/F;JLjava/lang/Object;Lm8/e;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/F$a;->q:LI8/F;

    iput-wide p2, p0, LI8/F$a;->r:J

    iput-object p4, p0, LI8/F$a;->s:Ljava/lang/Object;

    iput-object p5, p0, LI8/F$a;->t:Lm8/e;

    return-void
.end method


# virtual methods
.method public dispose()V
    .registers 2

    iget-object v0, p0, LI8/F$a;->q:LI8/F;

    invoke-static {v0, p0}, LI8/F;->q(LI8/F;LI8/F$a;)V

    return-void
.end method
