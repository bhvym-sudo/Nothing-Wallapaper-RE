.class final LH8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/c1;


# instance fields
.field public final q:LF8/n;


# direct methods
.method public constructor <init>(LF8/n;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/u;->q:LF8/n;

    return-void
.end method


# virtual methods
.method public b(LK8/A;I)V
    .registers 3

    iget-object p0, p0, LH8/u;->q:LF8/n;

    invoke-virtual {p0, p1, p2}, LF8/n;->b(LK8/A;I)V

    return-void
.end method
