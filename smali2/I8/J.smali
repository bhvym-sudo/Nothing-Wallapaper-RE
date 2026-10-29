.class final LI8/J;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LI8/f;

.field public final b:I

.field public final c:LH8/a;

.field public final d:Lm8/i;


# direct methods
.method public constructor <init>(LI8/f;ILH8/a;Lm8/i;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/J;->a:LI8/f;

    iput p2, p0, LI8/J;->b:I

    iput-object p3, p0, LI8/J;->c:LH8/a;

    iput-object p4, p0, LI8/J;->d:Lm8/i;

    return-void
.end method
