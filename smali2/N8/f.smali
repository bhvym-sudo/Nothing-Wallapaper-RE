.class public final LN8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN8/e;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lv8/q;

.field private final c:Lv8/q;

.field private final d:Lv8/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lv8/q;Lv8/q;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LN8/f;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LN8/f;->b:Lv8/q;

    .line 4
    iput-object p3, p0, LN8/f;->c:Lv8/q;

    .line 5
    invoke-static {}, LN8/l;->c()Lv8/q;

    move-result-object p1

    iput-object p1, p0, LN8/f;->d:Lv8/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lv8/q;Lv8/q;ILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x0

    .line 6
    :cond_5
    invoke-direct {p0, p1, p2, p3}, LN8/f;-><init>(Ljava/lang/Object;Lv8/q;Lv8/q;)V

    return-void
.end method


# virtual methods
.method public a()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/f;->b:Lv8/q;

    return-object p0
.end method

.method public b()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LN8/f;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public c()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/f;->c:Lv8/q;

    return-object p0
.end method

.method public d()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/f;->d:Lv8/q;

    return-object p0
.end method
